# HibernateProject
Basic Java+JPA/Hibernate+SQL integration.

Hello everyone!

Quick project to demonstrate how Java works with SQL databases. It is a HUGE deal in programming, because almost all data persistance is done through external SQL databases.

Java connects to SQL databases through JDBC driver framework, using simple SQL text commands relayed to the SQL database. Hibernate works on top of JDBC, by providing us with a very effective way to map classes and variables to rows and columns in SQL tables, among other things.

Althought this example is non-functional, all important things are there. Customer class matches to SQL entries, primary keys, etc. XML config file is ready. SQL table is standard for this. Entity manager is the actual connection object that Hibernate creates, and also it does the object-table mapping, hence ORM(object relational mapping). Maven, obviously.

I have typed way too much. I just love this stuff and could talk for hours.

In short, Java has a neat system to deal with databases. Other languages probably do the same thing. I know C# has exact copy of this system.

Great info on Entity Manager: https://docs.jboss.org/hibernate/entitymanager/3.6/reference/en/html_single/#d0e1030

Farewell!







