/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.json_data_import;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
/**
 *
 * @author Russell
 */
public class JsonSimpleReadExample {
    
    public static void readJsonFile() {

        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader("c:\\test\\jsonsample.txt"));
            
            /*   contents of file
            {
                "age":100,
                "name":"Person 1 Name",
                "messages":["msg 1","msg 2","msg 3"]
            }
            */
            
            /* structure of other json data
            { "records":[ {"Name":"Alfreds Futterkiste","City":"Berlin","Country":"Germany"}, 
            {"Name":"Ana Trujillo Emparedados y helados","City":"México D.F.","Country":"Mexico"}, 
            {"Name":"Antonio Moreno Taquería","City":"México D.F.","Country":"Mexico"}, 
            {"Name":"Around the Horn","City":"London","Country":"UK"}, 
            {"Name":"B's Beverages","City":"London","Country":"UK"}, 
            {"Name":"Berglunds snabbköp","City":"Luleå","Country":"Sweden"}, 
            {"Name":"Blauer See Delikatessen","City":"Mannheim","Country":"Germany"}, 
            {"Name":"Blondel père et fils","City":"Strasbourg","Country":"France"}, 
            {"Name":"Bólido Comidas preparadas","City":"Madrid","Country":"Spain"}, 
            {"Name":"Bon app'","City":"Marseille","Country":"France"}, 
            {"Name":"Bottom-Dollar Marketse","City":"Tsawassen","Country":"Canada"}, 
            {"Name":"Cactus Comidas para llevar","City":"Buenos Aires","Country":"Argentina"}, 
            {"Name":"Centro comercial Moctezuma","City":"México D.F.","Country":"Mexico"}, 
            {"Name":"Chop-suey Chinese","City":"Bern","Country":"Switzerland"}, 
            {"Name":"Comércio Mineiro","City":"São Paulo","Country":"Brazil"} ] }
            
            
            */

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);

            String name = (String) jsonObject.get("Name");
            System.out.println(name);

            long age = (Long) jsonObject.get("age");
            System.out.println(age);

            // loop array
            //JSONArray msg = (JSONArray) jsonObject.get("records");
            JSONArray msg = (JSONArray) jsonObject.get("messages");
            Iterator<String> iterator = msg.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    
}
