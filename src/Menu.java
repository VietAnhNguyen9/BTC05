

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manager product1 = new Manager(1, "Nước hoa", 4500000, 100, "Mùi hương quyến rũ");
        Manager product2 = new Manager(2, "Tonner", 300000, 50, "Dưỡng da");
        Manager product3 = new Manager(3, "Tẩy da chết", 400000, 200, "Tẩy tế bào chết");
        Manager product4 = new Manager(4, "Dầu gội", 100000, 300, "Dùng để gội đầu");
        Manager product5 = new Manager(5, "Kem chống nắng", 493000, 1000, "Chống nắng");
        Manager[] array = {product1, product2, product3, product4, product5};
       do{
           System.out.println("Menu");
           System.out.println("1.Thêm sản phẩm");
           System.out.println("2.Nhập id để sửa sản phẩm");
           System.out.println("3.Nhập id để xóa sản phẩm");
           System.out.println("4.Hiển thị tất cả sản phẩm");
           System.out.println("5.Hiển thị sản phẩm có giá lớn nhất");
           System.out.println("6.Hiển thị sản phẩm có giá nhỏ nhất");
           System.out.println("7.Hiển thị sản phẩm có số lượng nhiều nhất");
           System.out.println("8.Hiển thị sản phẩm có số lượng ít nhất");
           System.out.println("9.Tổng tiền hàng");
           System.out.println("Nhập số: ");
           int index = input.nextInt();
           if(index < 0 || index > 10) {
               System.out.println("Nhập lại");
           }else {
               switch (index) {
                   case 1:
                       System.out.println("Nhập thông tin Product");
                       System.out.println("Nhập ID");
                       int id = input.nextInt();
                       input.nextLine();
                       System.out.println("Nhập tên");
                       String name = input.nextLine();
                       System.out.println("Nhập giá");
                       double price = input.nextDouble();
                       System.out.println("Nhập số lượng");
                       int quantity = input.nextInt();
                       input.nextLine();
                       System.out.println("iNhập miêu tả");
                       String description = input.nextLine();
                       Manager[] arr1 = new Manager[array.length + 1];
                       Manager product6 = new Manager(id, name, price, quantity, description);
                       for (int i = 0; i < arr1.length - 1; i++) {
                           arr1[i] = array[i];
                       }
                       arr1[arr1.length - 1] = product6;
                       System.out.println("product sau khi thêm: ");
                       System.out.println(product6);
                       System.out.println("Mảng khi thêm là: ");
                       for (int i = 0; i < arr1.length; i++) {
                           System.out.println(arr1[i]);
                       }
                       break;
                   case 2:
                       System.out.println("Nhập id sản phẩm muốn sửa: ");
                       int id1 = input.nextInt();
                       boolean flag1 = true;
                       for (int i = 0; i < array.length; i++) {
                           if (id1 == array[i].getId()) {
                               flag1 = false;
                               System.out.println("Sửa id: ");
                               array[i].setId(input.nextInt());
                               input.nextLine();
                               System.out.println("Sửa Tên: ");
                               array[i].setName(input.nextLine());
                               System.out.println("Sửa giá: ");
                               array[i].setPrice(input.nextInt());
                               input.nextLine();
                               System.out.println("Sửa số lượng: ");
                               array[i].setQuantity(input.nextInt());
                               input.nextLine();
                               System.out.println("Sửa miêu tả: ");
                               array[i].setDescription(input.nextLine());
                               System.out.println("Product sau khi sửa: ");
                               System.out.println(array[i]);
                               break;
                           }
                       }
                       if (flag1) {
                           System.out.println("Không tìm thấy sản phẩm với id = " + id1);
                       }
                       break;
                   case 3:
                       System.out.println("Nhập id sản phẩm muốn xóa: ");
                       int id2 = input.nextInt();
                       boolean flag2 = true;
                       for (int i = 0; i < array.length; i++) {
                           if (id2 == array[i].getId()) {
                               flag2 = false;
                               break;
                           }
                       }
                       if (flag2) {
                           System.out.println("Không tìm thấy sản phẩm với id = " + id2);
                       }
                       else {
                          Manager[] arr2 = new  Manager[array.length - 1];
                           int index1 = 0;
                           for (int i = 0; i < array.length; i++) {
                               if (id2 != array[i].getId()) {
                                   arr2[index1] = array[i];
                                   index++;
                               }
                           }
                           System.out.println("Danh sách sản phẩm sau khi xóa:");
                           for (int i = 0; i < arr2.length; i++) {
                               System.out.println(arr2[i]);
                           }
                       }
                       break;
                   case 4:
                       System.out.println("Hiển thị mảng:");
                       for (int i = 0; i < array.length; i++) {
                           System.out.println(array[i]);
                       }
                       break;
                   case 5:
                       double maxPrice = array[0].getPrice();
                       int index1 = 1;
                       for (int i = 0; i < array.length; i++) {
                           if(array[i].getPrice()>maxPrice) {
                               maxPrice = array[i].getPrice();
                               index1 =i+1;
                           }
                       }
                       System.out.println("Sản phẩm đắt nhất :");
                       System.out.println("product"+index +" is price= "+maxPrice);
                       break;
                   case 6:
                       double minPrice = array[0].getPrice();
                       int index2 = 1;
                       for (int i = 0; i < array.length; i++) {
                           if(array[i].getPrice()<minPrice) {
                               minPrice = array[i].getPrice();
                               index2 =i+1;
                           }
                       }
                       System.out.println("Sản phẩm rẻ nhất :");
                       System.out.println("product"+index2 +" is price= "+minPrice);
                       break;
                   case 7:
                       double maxQuantity = array[0].getQuantity();
                       int index3 = 1;
                       for (int i = 0; i < array.length; i++) {
                           if(array[i].getPrice()>maxQuantity) {
                               maxQuantity = array[i].getQuantity();
                               index3 =i+1;
                           }
                       }
                       System.out.println("Sản phẩm có số lượng nhiều nhất :");
                       System.out.println("product"+index3 +" is quantity= "+maxQuantity);
                       break;
                   case 8:
                       double minQuantity = array[0].getQuantity();
                       int index4 =1;
                       for (int i = 0; i < array.length; i++) {
                           if(array[i].getPrice()<minQuantity) {
                               minQuantity = array[i].getQuantity();
                               index4 =i+1;
                           }
                       }
                       System.out.println("Sản phẩm có số lượng nhiều nhất :");
                       System.out.println("product"+index4 +" is quantity= "+minQuantity);
                       break;
                   case 9:
                       int sum=0;
                       for (int i = 0; i < array.length; i++) {
                           sum+= array[i].getPrice()*array[i].getQuantity();
                       }
                       System.out.println("Tổng tiền của tất cả sản phẩm hiện có là: "+sum);
                       break;
               }
           }
       }while(true);







    }
}
