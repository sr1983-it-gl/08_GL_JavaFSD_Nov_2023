-- Tables

select * from pricing;
select * from cust_details;
select * from orders;
select * from billing_details;
select * from cancelled_orders;
select * from cancelled_bills;
select * from pricing;


select * from orders;

select count(*) from orders;

select cust_id, quantity from orders;

select cust_id, sum(quantity) from orders
group by cust_id;


select CD.*, O.* from cust_details AS CD
    INNER JOIN (
	select cust_id, sum(quantity) as NoOfCylinders from orders
	group by cust_id
    ) AS O
 -- ON CD.Id = O.Cust_Id;



select Id, Name, Connection_Type, O.NoOfCylinders from cust_details AS CD
    INNER JOIN (
	select cust_id, sum(quantity) as NoOfCylinders from orders
	group by cust_id
    ) AS O
  ON CD.Id = O.Cust_Id;


select * from orders;
select * from billing_details;

select * from billing_details where Delivery_Status = 'Delivered';

select * from orders;

select Order_Id from billing_details where Delivery_Status = 'Delivered';

select * from Orders;



select O.Cust_Id, Quantity, O.Id  from Orders as O
inner join (
	select Order_Id from billing_details where Delivery_Status = 'Delivered') as BD
ON O.Id = BD.Order_ID;



select O.Cust_Id, sum(Quantity) as 'Successfully_Delivered' from Orders as O
inner join (
	select Order_Id from billing_details where Delivery_Status = 'Delivered') as BD
ON O.Id = BD.Order_ID
group by Cust_Id;

-- Question 5
SELECT Cust_Id, Successfully_Delivered, 
	CASE
		WHEN Successfully_Delivered >=8 THEN 'High Valued'
        WHEN Successfully_Delivered BETWEEN 5 AND 7 THEN 'Moderately Valued'
        ELSE 'Low Valued'
    END as 'Value Of Customer' 
	FROM 
    
    (
    
select O.Cust_Id, sum(Quantity) as 'Successfully_Delivered' 
from Orders as O
inner join (
	select Order_Id from billing_details 
    where Delivery_Status = 'Delivered') as BD
ON O.Id = BD.Order_ID
group by Cust_Id    
    ) as O_BD;



select * from cust_details;

select * from pricing where type = '19.0';


-- Question 07

select 
	CD.Name,
	O_BD.Cust_Id,
    CD.Connection_Type,
    O_BD.Order_Id,
	O_BD.Order_Date,
    O_BD.Inv_Id,
    O_BD.Delivery_Date
 from cust_details as CD
inner join (

select O.Id as Order_Id, O.Date as Order_Date, O.Cust_Id,
	BD.Inv_Id,
    BD.Delivery_Date
  from Orders as O
	inner join (
		select Inv_Id, Order_Id, date as 'Delivery_Date' 
        from billing_details
		where Delivery_Status = 'Delivered')
	as BD
ON O.Id = BD.Order_Id
) as O_BD
ON CD.Id = O_BD.Cust_Id


select 
	CD.Name,
	O_BD.Cust_Id,
    CD.Connection_Type,
    O_BD.Order_Id,
	O_BD.Order_Date,
    O_BD.Inv_Id,
    O_BD.Delivery_Date,
    monthname(O_BD.Delivery_Date) as 'Month',
    year (O_BD.Delivery_Date) as 'Year'
 from cust_details as CD
inner join (

select O.Id as Order_Id, O.Date as Order_Date, O.Cust_Id,
	BD.Inv_Id,
    BD.Delivery_Date
  from Orders as O
	inner join (
		select Inv_Id, Order_Id, date as 'Delivery_Date' 
        from billing_details
		where Delivery_Status = 'Delivered')
	as BD
ON O.Id = BD.Order_Id
) as O_BD
ON CD.Id = O_BD.Cust_Id
