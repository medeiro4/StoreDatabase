create table store
    (store_ID    numeric(12,0),
    street    varchar(60) NOT NULL,
    city    varchar(60) NOT NULL,
    state    varchar(60) NOT NULL,
    zip        numeric(5,0) NOT NULL,
    open_time    TIME NOT NULL, # HH:MM:SS or HHH:MM:SS
    close_time    TIME NOT NULL,
    primary key (store_ID)
    );

#tax rate based on tax (tax = state tax + local (zip) tax)
create table zip_tax
    (zip        numeric(5,0),
    tax        varchar(200),

    primary key (zip)
    );

create table taxed
    (tax_ID numeric(12,0),
    store_ID     numeric(12,0),
    zip        numeric(5,0),
    
    foreign key (store_ID) references store(store_ID),
    foreign key (zip) references zip_tax(zip),
    primary key (tax_ID)
    );

#List of products sold by chain
create table products
    (prod_ID        numeric(40,0),
    prod_publiser    varchar(200),
    prod_name    varchar(200),
    prod_type    varchar(200), #Type of product: Video Game, Electronics, Consoles, Accessories
    prod_condition    varchar(20),
    price numeric(4,0),
    warning_label            varchar(200), #(Early Childhood, Everyone, Everyone 10+, Teen, Mature, Adults Only)

    primary key (prod_ID)
    );

create table publisher
    (pub_ID        numeric(5,0),
    pub_name    varchar(200),
    
    primary key(pub_ID)
    );
   

create table publishes
    (publishes_ID numeric(5,0),
    pub_ID        numeric(5,0),
    prod_ID    numeric(40,0),
    
    foreign key(pub_ID) references publisher(pub_ID),
    foreign key(prod_ID) references products(prod_ID),
    primary key(publishes_ID)
    );

create table belongs_to
    (store_ID    numeric(12,0),
    prod_ID        numeric(40,0),
    price        numeric(8,2),
    prod_count    numeric(12,0),
    sold        numeric(12,0),
    returned    numeric(12,0),
    

    primary key(store_ID, prod_ID)
    
    );

#List of shoppers' info for shoppers program
create table shoppers_program
    (cust_ID    numeric(12,0),
    first_name        varchar(200),
    last_name        varchar(200),
    cust_DOB        DATE,
    cust_address        varchar(200),
    cust_email        varchar(200),
    cust_phone        varchar(200),
    credit_number    numeric(16,0),
    credit_month    numeric(2,0),
    credit_year        numeric(4,0),
    credit_security    numeric(3,0),
    
    primary key (cust_ID)
    );


create table shopping_cart
    (cart_ID    numeric(12,0),
    cust_ID        numeric(12,0),
    order_date    date,
    foreign key (cust_ID) references shoppers_program(cust_ID),
    primary key (cart_ID)
    );


    
    



#Customer purchase history
create table cart_detail
    (cartD_ID    numeric(12,0),
    store_ID    numeric(12,0),
    cart_ID        numeric(40,0),
    prod_ID        numeric(40,0),
    quantity    numeric(4,0),
    purchase_date    date,

    primary key (cartD_ID)
    
    );