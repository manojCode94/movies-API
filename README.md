<h1>Movies API</h1>
<h2>Description</h2>
<p>The Movies API is a RESTful API that provides movies data and streaming. This API is built using Java and Spring Boot and stores the data in MongoDB. The API can be used to retrieve movies data, search for movies based on various criteria, and stream movies.</p>

<h2>Tech Stack</h2>
<p>The following technologies were used in this project:</p>
<ul>
<li>Java</li>
<li>Spring Boot</li>
<li>MongoDB</li>
<li>MongoDB Compass</li>

<h2>Installation</h2>
<p>To run the Movies API, you will need to have Java and MongoDB installed on your system.</p>

<h2>Clone the Repository</h2>
<h3>bash<h3>
Copy code : git clone https://github.com/your-username/movies-api.git
cd movies-api

<h2>Install Dependencies<h2>
<h3>bash</h3>
Copy code : ./mvnw clean install

</h2>Run the Application</h2>
<h3>bash</h3>
Copy code: ./mvnw spring-boot:run

<h2>Usage</h2>
<p>Once the application is running, you can access the API by visiting http://localhost:8080 in your web browser or using an API client like Postman.</p>

<h2>Endpoints</h2>
The following endpoints are available:

<p>api/v1/movies/movies - returns a list of all movies.</p>
<p>api/v1/movies/imdbid/{imdbid} - returns the movie with the specified ID.</p>

