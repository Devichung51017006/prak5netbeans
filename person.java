
package percobaan2;

public class person {protected String name; protected String address;

  public person(){

System.out.println("Inside Person:Constructor");
name = "";
address = "";
}

public person (String name, String address){
this.name = name;
this.address = address;
}

public String getName(){
return name;
}

public String getAddress(){
return address;
}

public void setName(String name){
this.name = name;
}

public void setAddress(String add) {
this.address = add;
}
   
   }
    

