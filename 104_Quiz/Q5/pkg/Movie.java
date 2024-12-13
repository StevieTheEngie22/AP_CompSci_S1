package pkg;

public class Movie{
 String name;
 double rating;
 int numberOfRatings;
 int revenue;
 
 public Movie(){    //DEFAULT
     name = "Avengers";
     rating = 8.0;
     numberOfRatings = 33;
     revenue = 623357910;
 }

public Movie(String name, double rating, int numberOfRatings, int revenue){
    this.name = name;
    this.rating = rating;
    this.numberOfRatings = numberOfRatings;
    this.revenue = revenue;
}

public void movieToString(){   //PART 2
    System.out.println("Movie: " + name);
    System.out.println("Rating: " + rating);
    System.out.println("Number of Ratings: " + numberOfRatings);
    System.out.println("Revenue: " + revenue);
    System.out.println("        ");  // EXTRA LINE
}
public String getMovieName(){  //PART 3
    return name;
}
public int getRevenue(){
    return revenue;
    }
    
public void addRating(double num1){ //PART 4
   double rating1 = rating * numberOfRatings;
   double rating2 = rating1 + num1;
   double rating3 = rating2 / (numberOfRatings + 1);
   rating = rating3;
   numberOfRatings = numberOfRatings + 1;
}

public boolean compareRatings(Movie A){ //PART 5
if(this.rating > rating){
    return true;
}
else{
    return false;
}
}


}