Developed the backend of a Movie Booking Application. This application has the following features:- 
The application allows users to:

• View a list of all the available movies (GET /ticket/movies).

• Add new movies to the system (POST /ticket/movie).

• Retrieve details of a particular movie by providing its unique Id (GET /ticket/movie/{id}).

• Delete a movie from the system using its Id (DELETE /ticket/movie/{id}).

• Update details of a movie by providing its Id (PUT /ticket/update/{id}).

• Get error messages if I try to add a movie with an existing Id.

• Get an error message if I try to retrieve or delete a movie that does not exist in the system.

• Validate movie details like movie name, Id, and movie director name.

Note:- All the data is stored is stored in the memory itself and not on any DB.
