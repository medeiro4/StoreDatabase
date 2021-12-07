# StoreDatabase
Database Project


Course Project Information
Class: Database Systems
Members, Romario Medeiros, Rachel Powers, Stanley Wang

YouTube video presentation: https://youtu.be/gXKD_EbxUiw

This project is a representation of a game store’s database, called Just Playin. This database is meant to keep track of stores, tax information, products, product publishers, purchases, clients, and purchase history.

Instructions:
Within	a visual database design tool, preferably MySQL Workbench, create a new database schema called “just_playin”. 
Double click on the just_playin database schema, under the SCHEMAS section, so that it is selected.
To populate the tables for the store, open up the file JustPlatingDDL.sql, within MySQL Workbench, then press the execute button to propagate the tables. The execute button might appear like an image of an electric bolt icon.
After the tables are populated, the data for the tables must be populated. 
To do this, open up the file JustPlayinINSERTS.sql within MySQL Workbench, then press the execute button to populate the tables. The execute button might appear like an image of an electric bolt icon.
You should now have the full Just Playin database ready for use.


_______________________________________________Table Information___________________________________________________

List of tables: 
-	store: Keeps track of all store branches. For each store, their store ID, address, and open and close time is recorded.
-	zip_tax: Keeps track of the state and local tax rate for each zipcode.
-	products: Keeps track of all products that the Just Playin franchise. For each product, their product ID, product name, product type, product condition, price, and warning labels are recorded.
-	publisher: Keeps track of the names of all publishers that has a product available 
-	shopping_cart: Keeps track of which cart belongs to which customer. 
-	shoppers_program: Keeps track of shoppers’ information, including customer ID, first and last name, date of birth, address, phone number, and credit card information.


List of relational tables:
-	taxed: Links all stores with their sales tax rate by linking tables “store” and “zip_tax”.
-	belongs_to: Links all stores to the products they are selling to create an inventory for each store. For each product type available within a store, their product count, product sold, and product returned is also recorded.
-	cart_detail: Links shopping cart (shopping_cart), customers (shoppers_program) and products (products) to keep track of customers purchase history. 
-	publishes: Links publisher and products to keep track of which products and published by which publisher.
