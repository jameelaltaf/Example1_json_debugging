/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debugging01;

import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


/**
 *
 * @author 1894832
 */
public class Debugging01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String json = FileReader.loadFileIntoString("json/catalog.json","UTF-8");
        System.out.println(json);
    
        JSONArray  mainObject = JSONArray.fromObject(json);
        JSONObject singleBook;
        String id_json, title,author;
                Boolean available;
                Double price;
                int year;
        
        
        for(int i=0; i<mainObject.size(); i++)
        {
            
            singleBook = mainObject.getJSONObject(i);
            id_json = singleBook.getString("id");
            title = singleBook.getString("title");
            author = singleBook.getString("author");
            available= singleBook.getBoolean("available");
            price = singleBook.getDouble("price");
            year = singleBook.getInt("year");
            if(year<=2010){
                System.out.println("If YEAR IS GREATER THAN 2010 OR EQUAL");
            
             System.out.println(singleBook);
             System.out.println("{\n" + id_json + ",\n" + title + ",\n" + author + ",\n" + available + ",\n" + price + ",\n" + year + "\n}");
            }
        }
        
           
    }
}
