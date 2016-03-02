package tasks;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;

import app.Config;
import app.FacturasHelper;

public class SendInvoiceMail extends Thread implements FacturasHelper {
	
	int[] selectedRows;
	JTable table1;
	JLabel labelProgress;
	TableRowSorter<TableModel> sorter;
    HttpURLConnection connection = null;
    JProgressBar progressBar;
    FileOutputStream fileOS = null;
    InputStream input = null;

	
	
	public SendInvoiceMail(int[] selectedRows, JTable table1, TableRowSorter<TableModel> sorter, JLabel labelProgress, JProgressBar progressBar) {
		super();
		this.selectedRows = selectedRows;
		this.table1 = table1;
		this.sorter = sorter;
		this.labelProgress = labelProgress;
		this.progressBar = progressBar;
	}
	
	
	@Override
	public void run() {
		labelProgress.setVisible(true);
        progressBar.setVisible(true);
        labelProgress.setText("Enviando emails...");
                
		String json = getJson(selectedRows, table1, sorter);
		System.out.println(json);
		
		try {
			
			URL url = new URL(new Config(Thread.currentThread().getContextClassLoader()).getProperty("send_invoice_email"));
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        connection.setConnectTimeout(5000); //Timeout 5s
	        List nameValuePairs = new ArrayList(1);
            System.out.println(json);
            nameValuePairs.add(new BasicNameValuePair("jsonData", json));
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(nameValuePairs);
            connection.setDoOutput(true);
            OutputStream postOut = connection.getOutputStream();
            entity.writeTo(postOut);
            postOut.flush();
            
        	BufferedReader in = new BufferedReader(
    		        new InputStreamReader(connection.getInputStream()));
    		String inputLine;
    		StringBuffer response = new StringBuffer();

    		while ((inputLine = in.readLine()) != null) {
    			response.append(inputLine);
    		}
    		in.close();
    		
    		
    		if(response.toString().equals("ok")) {
    			this.labelProgress.setText("Emails enviados con éxito");
    		}
    		
    		else {
    			this.labelProgress.setText("Error al enviar mails");
    			System.out.println("Response: "+response);
    		}

            
            

		} catch (IOException e) {
			// TODO Auto-generated catch block
    		this.labelProgress.setText("Error al enviar mails: "+e.getMessage());
		}
		
	}
}
