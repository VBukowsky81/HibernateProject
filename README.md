# HibernateProject
Basic Java+JPA/Hibernate+SQL integration.

Hello everyone!

Quick project to demonstrate how Java works with SQL databases. It is a HUGE deal in programming, because ALL persistance is done through external SQL databases. You can't store permament data in Java, we're operating random memory. So to store data, we use additional tools. SQL/noSQL databases are the standard for this. Java connects to SQL databases through JDBC driver framework, using simple SQL text commands relayed to the SQL database. Hibernate works on top of JDBC, by providing us very effective way to map classes and variables to fields and columns in SQL tables, among other things.

This example is non-functional. First, I could never figure out proper settings for connection itself. Matching up SQL settings and Hibernate's XML is a major problem. Second, since I wasn't able to run the connection, I couldn't test it fully, so lots of code pieces are missing.

But all important things are there. Customer class matches to SQL entries, primary keys, etc. XML config file is ready. SQL table is standard for this. Entity manager is the actual connection object that Hibernate creates, and also it does the object-table mapping, hence ORM(object relational mapping). Maven, obviously.

I have typed way too much. I just love this stuff and could talk for hours.

In short, Java has a neat system to deal with databases. Other languages probably do the same thing. I know C# has exact copy of this system.

Farewell!







