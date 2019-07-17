import java.io.*;
import java.util.*;

class Employee {
  private int id;
  private String name;
  private String address;

  Employee() {
    id = 0;
    name = "";
    address = "";
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }
}

class SwastikRandomAccess {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int size = 2;

    int i,id;
    String name, address;

    System.out.println("**** Employee Recording Application ****");

    Employee e[] = new Employee[size];

    for(i = 0; i < size; i++) {
      e[i] = new Employee();
      System.out.println("\nEnter information for Employee " + (i+1));
      System.out.println();
      System.out.print("Enter ID: ");
      id = sc.nextInt();
      System.out.print("Enter name: ");
      name = sc.next();
      System.out.print("Enter address: ");
      address = sc.next();

      e[i].setId(id);
      e[i].setName(name);
      e[i].setAddress(address);
    }

    RandomAccessFile f = new RandomAccessFile("random.txt", "rw");

    for(i = 0; i < size; i++) {
      f.write(e[i].getId());
      f.writeUTF(e[i].getName());
      f.writeUTF(e[i].getAddress());
    }

    System.out.println("\nEmployee Data is successfully written to the file.");
    f.close();

    int id1[] = new int[size];
    String nam[] = new String[size];
    String add[] = new String[size];

    RandomAccessFile r = new RandomAccessFile("random.txt", "r");

    System.out.println("\nAnd Data from the file is as follow:\n");
    for(i = 0; i < size; i++) {
      id1[i] = r.read();
      nam[i] = r.readUTF();
      add[i] = r.readUTF();
      // if(nam[i].equals("Madhav")) {
        System.out.println("ID: " + id1[i] + "\tName: " + nam[i] + "\tAddress: " + add[i]);
      // }
    }
  }
}