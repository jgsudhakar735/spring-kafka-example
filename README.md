# spring-kafka-example
This is a simple Spring application integrated with Kafka System . This will be used if there is a large number of hit comes to systems to process data. Typically in the centralized Auditing Scenario as an example.

We are done with the required Java code. Now lets start Apache Kafka. 

<h1> How to Run Kafka Server </h1>

1. Go to Kafka bin Directory 
2. If Windows go to the bin directory and type the beow command. Before we start Kafka server make sure zookeeper is running . 
3. Start the zookeeper using the below command. (ZooKeeper configuration : make sure you update the log directory and groups in config files)

<h2Start ZooKeeper Server:</h2>
D:kafka_home_dir\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
  
 <h2> Start Kafka Server </h2>
 D:kafka_home_dir\bin\windows\kafka-server-start.bat .\config\server.properties
 
 
  

