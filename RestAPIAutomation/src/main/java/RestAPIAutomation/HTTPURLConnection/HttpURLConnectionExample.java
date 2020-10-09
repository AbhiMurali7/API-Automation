package RestAPIAutomation.HTTPURLConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpURLConnectionExample 
{

	public void getMethod() throws IOException {

		//Open the URL
		URL geturl = new URL("http://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection =  (HttpURLConnection)geturl.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();

		//Get the Status Code
		int statusCode = connection.getResponseCode();
		System.out.println("Status Code is" + statusCode);

		//Get the Status Code
		String statusMessage = connection.getResponseMessage();
		System.out.println("Response Message is" + statusMessage);

		//Create an InputStream reader for reading the response body
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		//Create a buffered reader and pass the inputstream reader
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);

	}


	public void postMethod() throws IOException {

		//Open the URL
		URL posturl = new URL("http://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection =  (HttpURLConnection)posturl.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		String jsonBody = "{\"name\":\"Abhi\",\"salary\":\"45000\",\"age\":\"24\"}";
		byte[] inputJson = jsonBody.getBytes();

		//Create an OutputStream reader for reading the response body
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputJson);
		System.out.println("Response Code" + connection.getResponseCode());
		System.out.println("Response Code" + connection.getResponseMessage());

		//Create an InputStream reader for reading the response body
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		//Create a buffered reader and pass the inputstream reader
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);

	}

	public void putMethod() throws IOException {

		//Open the URL
		URL puturl = new URL("http://dummy.restapiexample.com/api/v1/update/26081");
		HttpURLConnection connection =  (HttpURLConnection)puturl.openConnection();
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		//update the age as 27
		String jsonBody = "{\"name\":\"Abhi\",\"salary\":\"45000\",\"age\":\"27\"}";
		byte[] inputJson = jsonBody.getBytes();

		//Create an OutputStream reader for reading the response body
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputJson);
		System.out.println("Response Code" + connection.getResponseCode());
		System.out.println("Response Code" + connection.getResponseMessage());

		//Create an InputStream reader for reading the response body
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		//Create a buffered reader and pass the inputstream reader
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);

	}

	public void deleteMethod() throws IOException {

		//Open the URL
		URL deleteurl = new URL("http://dummy.restapiexample.com/api/v1/delete/26081");
		HttpURLConnection connection =  (HttpURLConnection)deleteurl.openConnection();
		connection.setRequestMethod("Delete");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);

		System.out.println("Response Code" + connection.getResponseCode());
		System.out.println("Response Code" + connection.getResponseMessage());

		//Create an InputStream reader for reading the response body
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		//Create a buffered reader and pass the inputstream reader
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);


	}

	public static void main( String[] args ) throws IOException
	{
		HttpURLConnectionExample connection = new HttpURLConnectionExample();
		connection.getMethod();
		connection.postMethod();
		connection.putMethod();
		connection.deleteMethod();
	}
}
