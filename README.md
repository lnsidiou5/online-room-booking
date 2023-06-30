# online-room-booking
A project I worked on to create a web app that acts similarly to Airbnb.

# Things to Note
Currently, the project cannot be run unless the following are made:
  1) An RDS_ENDPOINT is set to an existing relational database (I originally used a MySQL RDS managed by Amazon RDS, which I have already shut down).
  2) A Google Cloud Storage bucket (for image storage)
  3) A Google Compute Engine Virtual Machine Instance (to install and use Elasticsearch).
  4) A GeoCoding API Key (Which you can also get from the Google Cloud Platform)

# How to Install and Run the Project
1. Create an RDS Instance (If you use AWS RDS, then you may need to create a security group as well)
2. Input the relevant information into the 'src/main/resources/applications.properties' file.
3. Use Maven to clean and install the project.
4. Create a Google App Engine Instance and deploy the "roombooking-0.0.1-SNAPSHOT.jar" file to it.

# How to Use the Project
This project is essentially a basic imitation of the functionalities of an online room booking service website but has no commercial value whatsoever.
