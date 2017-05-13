package com.mycompany.json_data_import;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONException;
import org.json.JSONObject;
//more by rt
//import org.json.simple.JSONObject;
import org.json.simple.*;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;
//this is from stack overflow
//Using the Maven artifact org.json:json 

public class JsonReader {
  private static String readAll(Reader reader) throws IOException {
    StringBuilder sb = new StringBuilder();
    int cp;
    while ((cp = reader.read()) != -1) {
      sb.append((char) cp);
      
    }
    System.out.println("line 23: " + sb.toString());
    return sb.toString();
  }

  public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
    InputStream is = new URL(url).openStream();
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
      String jsonText = readAll(reader);
      JSONObject json = new JSONObject(jsonText);
      
      
      System.out.println("line 42: " + json + " \n json.keys" + json.keys()); //object
      System.out.println("line 43: " + json.names());
      System.out.println("line 44: " + jsonText);//same as line 23
      
      
      
//      JSONObject obj = new JSONObject("{\"Name\":\"Alfreds Futterkiste\",\"City\":\"Berlin\",\"Country\":\"Germany\"}");
//      System.out.println(obj.getString("Name")); 
//      System.out.println(obj.getString("City")); 
//       
//       System.out.println(json.getString("records")); //need inner objects or array? records is entire set
      // JSONArray jsa = new JSONArray();
      // jsa = json.toJSONArray();
       
       //System.out.println(jsa.);
        
        
        //System.out.println(json.getJSONObject(jsonText));
       // System.out.println(json.getString("https://www.w3schools.com/angular/customers.php"));

     // System.out.println("line 41: " + json.);
//      System.out.println("line 42: " + json.getString("Name"));
//      String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
//       //  Object obj = parser.parse(s);
//         JSONArray array = (JSONArray)obj;
      
      return json;
      
      /*
      
      JSONParser parser = new JSONParser();
      String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
		
      try{
         Object obj = parser.parse(s);
         JSONArray array = (JSONArray)obj;
			
         System.out.println("The 2nd element of array");
         System.out.println(array.get(1));
         System.out.println();

         JSONObject obj2 = (JSONObject)array.get(1);
         System.out.println("Field \"1\"");
         System.out.println(obj2.get("1"));    

         s = "{}";
         obj = parser.parse(s);
         System.out.println(obj);

         s = "[5,]";
         obj = parser.parse(s);
         System.out.println(obj);

         s = "[5,,2]";
         obj = parser.parse(s);
         System.out.println(obj);
      }catch(ParseException pe){
		
         System.out.println("position: " + pe.getPosition());
         System.out.println(pe);
      
      */
    } finally {
      is.close();
    }
  }
  
  

  public static void main(String[] args) throws IOException, JSONException {
    JSONObject json = readJsonFromUrl("https://www.w3schools.com/angular/customers.php");
    //JSONArray jsonArray = new JSONArray();
   // System.out.prinln(json.toJSONArray(jsonArray("Name").toString()));
    json.names();
    
  // JsonSimpleReadExample jsonEx = new JsonSimpleReadExample();
    //jsonEx.readJsonFile();
    
    //JsonSimpleReadExample2
  // JsonSimpleReadExample2 jsonEx2 = new JsonSimpleReadExample2();
//    jsonEx2.readJsonFile();
    
    

    
    
    //Customer myCustomer = new Customer();
   // System.out.println(myCustomer.toString());
    
    //System.out.println(json.toString());
    //System.out.println(json.get("Name"));
  }
}