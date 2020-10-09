package RestAPIAutomation.Unirest;

import java.io.IOException;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import RestAPIAutomation.HTTPURLConnection.HttpURLConnectionExample;

public class UnirestHttpRequestExample {

	public void getRequest() throws UnirestException {
		HttpResponse <JsonNode> jsonResponse = Unirest.get("http://dummy.restapiexample.com/api/v1/employees").asJson();
		System.out.println("Status Code:" + jsonResponse.getStatus());
		System.out.println("Status Message:" + jsonResponse.getStatusText());
		System.out.println("Response Body:" + jsonResponse.getBody());
	}

	public void postRequest() throws UnirestException {
		HttpResponse <JsonNode> jsonResponse = Unirest.post("http://dummy.restapiexample.com/api/v1/create").body("{\"name\":\"Abhi\",\"salary\":\"45000\",\"age\":\"27\"}").asJson();
		System.out.println("Status Code:" + jsonResponse.getStatus());
		System.out.println("Status Message:" + jsonResponse.getStatusText());
		System.out.println("Response Body:" + jsonResponse.getBody());
	}

	public void putRequest() throws UnirestException {
		HttpResponse <JsonNode> jsonResponse = Unirest.put("http://dummy.restapiexample.com/api/v1/update/26081").body("{\"name\":\"Abhi\",\"salary\":\"45000\",\"age\":\"26\"}").asJson();
		System.out.println("Status Code:" + jsonResponse.getStatus());
		System.out.println("Status Message:" + jsonResponse.getStatusText());
		System.out.println("Response Body:" + jsonResponse.getBody());
	}
	public void deleteRequest() throws UnirestException {
		HttpResponse <JsonNode> jsonResponse = Unirest.delete("http://dummy.restapiexample.com/api/v1/delete/26081").asJson();
		System.out.println("Status Code:" + jsonResponse.getStatus());
		System.out.println("Status Message:" + jsonResponse.getStatusText());
		System.out.println("Response Body:" + jsonResponse.getBody());
	}
	public static void main( String[] args ) throws IOException, UnirestException
	{
		UnirestHttpRequestExample connection = new UnirestHttpRequestExample();
		connection.getRequest();
		connection.postRequest();
		connection.putRequest();
		connection.deleteRequest();
	}
}