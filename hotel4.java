/* GROUP NUMBER: 22
 * SRINIDHI KANNAN (BL.EN.U4AIE21121)
 * SURYAMRITHA M (BL.EN.U4AIE21126)
 * VARSHINI BALAJI (BL.EN.U4AIE21139)
 */

package endsem;    //PACKAGE
import java.util.*;
interface eat{       //INTERFACE
void rating();
}
public class hotel4 implements eat {    //CLASS
String response;
static int Hotel_name;
public void display(){                   //METHOD
System.out.println("The Restaurants are:");
System.out.println("1.Udupi Palace Hotel");
System.out.println("2.Hotel Bliss");
System.out.println("3.Hotel Elite");
}
public static class Udupi extends hotel4 implements eat {    //HIERARCHIAL INHERITANCE
public void rating() {
System.out.println("Ratings:4");
}
public void display() {
System.out.println("Welcome to Udupi Palace Hotel");
}}
public static class Hotel_Bliss extends hotel4 implements eat{
public void rating() {
System.out.println("Ratings:4.5");
}
public void display() {
System.out.println("Welcome to Hotel Bliss");
}
}
public static class Hotel_Elite extends hotel4 implements eat{
public void rating() {
System.out.println("Rtaings:3.5");
}
public void display() {
System.out.println("Welcome to Hotel Elite");
}
}
hotel4(String a,int b){      //CONSTRUCTOR 
response=a;
Hotel_name=b;
}public hotel4(String name) {    //CONSTRUCTOR OVERLOADING
 response=name;
}public hotel4() {}     //surya
public static Scanner input = new Scanner(System.in);      //SCANNER CLASS
public static String again;
public static int choose,quantity=1;
public static double total=0,pay;
private static Object b2;
public static void menu(){
System.out.println("\t\t\t\t+===================================+");
System.out.println("\t\t\t\t\t\t MENU ");
System.out.println("\t\t\t\t STARTERS");
System.out.println("\t\t\t\t 1. CHILLI PANEER          Rs. 95.00");
System.out.println("\t\t\t\t 2. FRENCH FRIES           Rs. 40.00");
System.out.println("\t\t\t\t 3. CHEESE NUGGETS         Rs. 35.00");
System.out.println("\t\t\t\t MAIN COURSE");
System.out.println("\t\t\t\t 4. BIRYANI                Rs. 140.00");
System.out.println("\t\t\t\t 5. FRIED RICE             Rs. 120.00");
System.out.println("\t\t\t\t 6. BUTTER NAAN            Rs. 35.00");
System.out.println("\t\t\t\t BEVERAGES");
System.out.println("\t\t\t\t 7. COFFEE                 Rs. 15.00");
System.out.println("\t\t\t\t 8. TEA                    Rs. 20.00");
System.out.println("\t\t\t\t 9. BOOST                  Rs. 25.00");
System.out.println("\t\t\t\t DESSERTS");
System.out.println("\t\t\t\t 10. CHOCO LAVA CAKE        Rs. 95.00");
System.out.println("\t\t\t\t 11. PUDDING                Rs. 40.00");
System.out.println("\t\t\t\t 12. ICE-CREAM              Rs. 35.00");
System.out.println("\t\t\t\t 13. CANCEL ");
System.out.println("\t\t\t\t+====================================+");
}
public static void order(){
System.out.println("Press numbers from 1 to 13 to place your order");
System.out.print("Press you want to buy? :");
choose = input.nextInt();
//CONDITIONAL LOOPS
if(choose==1){
System.out.println("You chose Chilli Panner");
System.out.print("Quantity :");
quantity =input.nextInt();
total = total +(quantity*95);System.out.println("You want to buy again? ");
System.out.println("Press Y for Yes and N for N : ");
again = input.next();
if(again.equalsIgnoreCase("Y")){
order();//call the method you to create
}else{
System.out.println("Enter a payment ");
pay = input.nextDouble();
if(pay <=total){
System.out.println("Not enough payment");
}else{
System.out.println("Total price is " + total);
total = pay-total;
System.out.println("The change is " + total);
}
}
}else if(choose==2){
System.out.println("You chose FRENCH FRIES");
System.out.print("Quantity:");
quantity =input.nextInt();
total = total +(quantity*40);System.out.println("You want to buy again? ");
System.out.println("Press Y for Yes and N for N : ");
again = input.next();
if(again.equalsIgnoreCase("Y")){
order();//call the method you to create
}else{
System.out.println("Enter a payment ");
pay = input.nextDouble();
if(pay <=total){
System.out.println("Not enough payment");
}else{
System.out.println("Total price is " + total);
total = pay-total;
System.out.println("The change is " + total);
}
}
}else if(choose==3){
System.out.println("You chose CHEESE NUGGETS");
System.out.print("Quantity :");
quantity =input.nextInt();
total = total +(quantity*35);System.out.println("You want to buy again? ");
System.out.println("Press Y for Yes and N for N : ");
again = input.next();
if(again.equalsIgnoreCase("Y")){
order();//call the method you to create
}else{
System.out.println("Enter a payment ");
pay = input.nextDouble();
if(pay <=total){
System.out.println("Not enough payment! Sorry,Order not placed.");
}else{
System.out.println("Total price is " + total);
total = pay-total;
System.out.println("The change is " + total);
}
}
}
else if(choose==4){
System.out.println("You chose BIRYANI");
System.out.print("Quantity:");
quantity =input.nextInt();
total = total +(quantity*140);System.out.println("You want to buy again? ");
System.out.println("Press Y for Yes and N for N : ");
again = input.next();
if(again.equalsIgnoreCase("Y")){
order();//call the method you to create
}else{
System.out.println("Enter a payment ");
pay = input.nextDouble();
if(pay <=total){
System.out.println("Not enough payment");
}else{
System.out.println("Total price is " + total);
total = pay-total;
System.out.println("The change is " + total);
}
}
}
else if(choose==5){
System.out.println("You chose FRIED RICE");
System.out.print("Quantity:");
quantity =input.nextInt();
total = total +(quantity*120);System.out.println("You want to buy again? ");
System.out.println("Press Y for Yes and N for N : ");
again = input.next();
if(again.equalsIgnoreCase("Y")){
order();//call the method you to create
}else{
System.out.println("Enter a payment ");
pay = input.nextDouble();
if(pay <=total){
System.out.println("Not enough payment");
}else{
System.out.println("Total price is " + total);
total = pay-total;
System.out.println("The change is " + total);
}
}
}
else if(choose==6){
System.out.println("You chose BUTTER NAAN");
System.out.print("Quantity:");
quantity =input.nextInt();
total = total +(quantity*35);System.out.println("You want to buy again? ");
System.out.println("Press Y for Yes and N for N : ");
again = input.next();
if(again.equalsIgnoreCase("Y")){
order();//call the method you to create
}else{
System.out.println("Enter a payment ");
pay = input.nextDouble();
if(pay <=total){
System.out.println("Not enough payment");
}else{
System.out.println("Total price is " + total);
total = pay-total;
System.out.println("The change is " + total);
}
}
}
else if(choose==7){
System.out.println("You chose COFFEE");
System.out.print("Quantity:");
quantity =input.nextInt();
total = total +(quantity*15);System.out.println("You want to buy again? ");
System.out.println("Press Y for Yes and N for N : ");
again = input.next();
if(again.equalsIgnoreCase("Y")){
order();//call the method you to create
}else{
System.out.println("Enter a payment ");
pay = input.nextDouble();
if(pay <=total){
System.out.println("Not enough payment");
}else{
System.out.println("Total price is " + total);
total = pay-total;
System.out.println("The change is " + total);
}
}
}
else if(choose==8){
System.out.println("You chose TEA");
System.out.print("Quantity:");
quantity =input.nextInt();
total = total +(quantity*20);System.out.println("You want to buy again? ");
System.out.println("Press Y for Yes and N for N : ");
again = input.next();
if(again.equalsIgnoreCase("Y")){
order();//call the method you to create
}else{
System.out.println("Enter a payment ");
pay = input.nextDouble();
if(pay <=total){
System.out.println("Not enough payment");
}else{
System.out.println("Total price is " + total);
total = pay-total;
System.out.println("The change is " + total);
}
}
}
else if(choose==9){
System.out.println("You chose BOOST");
System.out.print("Quantity:");
quantity =input.nextInt();
total = total +(quantity*25);System.out.println("You want to buy again? ");
System.out.println("Press Y for Yes and N for N : ");
again = input.next();
if(again.equalsIgnoreCase("Y")){
order();//call the method you to create
}else{
System.out.println("Enter a payment ");
pay = input.nextDouble();
if(pay <=total){
System.out.println("Not enough payment");
}else{
System.out.println("Total price is " + total);
total = pay-total;
System.out.println("The change is " + total);
}
}
}
else if(choose==10){
System.out.println("You chose CHOCO LAVA CAKE");
System.out.print("Quantity:");
quantity =input.nextInt();
total = total +(quantity*95);System.out.println("You want to buy again? ");
System.out.println("Press Y for Yes and N for N : ");
again = input.next();
if(again.equalsIgnoreCase("Y")){
order();//call the method you to create
}else{
System.out.println("Enter a payment ");
pay = input.nextDouble();
if(pay <=total){
System.out.println("Not enough payment");
}else{
System.out.println("Total price is " + total);
total = pay-total;
System.out.println("The change is " + total);
}
}
}
else if(choose==11){
System.out.println("You chose PUDDING");
System.out.print("Quantity:");
quantity =input.nextInt();
total = total +(quantity*40);System.out.println("You want to buy again? ");
System.out.println("Press Y for Yes and N for N : ");
again = input.next();
if(again.equalsIgnoreCase("Y")){
order();//call the method you to create
}else{
System.out.println("Enter a payment ");
pay = input.nextDouble();
if(pay <=total){
System.out.println("Not enough payment");
}else{
System.out.println("Total price is " + total);
total = pay-total;
System.out.println("The change is " + total);
}
}
}
else if(choose==12){
System.out.println("You chose ICE-CREAM");
System.out.print("Quantity:");
quantity =input.nextInt();
total = total +(quantity*35);System.out.println("You want to buy again? ");
System.out.println("Press Y for Yes and N for N : ");
again = input.next();
if(again.equalsIgnoreCase("Y")){
order();//call the method you to create
}else{
System.out.println("Enter a payment ");
pay = input.nextDouble();
if(pay <=total){
System.out.println("Not enough payment");
}else{
System.out.println("Total price is " + total);
total = pay-total;
System.out.println("The change is " + total);
}
}
}
else if(choose==13){
System.exit(0);//close program
}else{
System.out.println("Choose 1 to 13 only!");
order();
}
}                    //sri
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("\t\t\tSVS FOOD DELIVERY");
System.out.println("for viewing the restaurants");
String response = scanner.nextLine();
hotel4 a1= new hotel4(response);       //OBJECT CREATION
a1.display();
System.out.println("Choose restaurant Number from the above!");
Scanner scan = new Scanner(System.in);
int no = scan.nextInt();
System.out.println(no);
hotel4 a2= new hotel4(response,no);     //CONSTRUCTOR OVERLOADING
hotel4 b1= new Udupi();      //DYNAMIC METHOD DISPATCH
if (Hotel_name == 1) {
b1.rating();
b1.display();              //METHOD OVERRIDING
}
hotel4 b2= new Hotel_Bliss();
if (Hotel_name == 2) {
b2.rating();
b2.display();
}
hotel4 b3= new Hotel_Elite();
if (Hotel_name == 3) {
b3.rating();
b3.display();
}
abstract class details{          //ABSTRACTION
	abstract void det();
	 }

	 class abc extends details{
	int order_no=123456;
	String name="RIYA BAMAN";
	String address="deja vu apt.,kasavanahalli, bangalore 560035. ";
	void det(){System.out.println("name:"+name+"\norder number:"+order_no);
	 System.out.println("address: "+address);
	 
	 }}
menu();
order();
details obj = new abc();
obj.det();
}}



