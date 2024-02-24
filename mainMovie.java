public class mainMovie {
    public static void main(String[] args) {

//        Movie theMovie = new Adventure("Star Wars");
//        theMovie.watchMovie();
//
//        Movie theMovie2 = new Comedy("Danmkus");
//        theMovie2.watchMovie();
//
//        Movie theMovie3 = Movie.getMovie("Adventure", "Iron Man");
//        theMovie3.watchMovie();
//
//        Movie theMovie4 = Movie.getMovie("Science", "New Hope");
//        theMovie4.watchMovie();
//        Scanner s = new Scanner(System.in);
//        while (true) {
//            System.out.print("Enter Type ( A for Adventure, C for Comedy " +
//                    "S for Science Fiction, or Q to Quit ): ");
//            String type = s.nextLine();
//            if ("Qq".contains(type)) {
//                break;
//            }
//            System.out.println("Enter Movie Title: ");
//            String title = s.nextLine();
//            Movie movie = Movie.getMovie(type,title);
//            movie.watchMovie();
//        }
        Object unknownObject = Movie.getMovie("S","Airplane");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchMovie();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchMovie();
        } else if (unknownObject instanceof ScienceFiction syfy) {
             syfy.watchMovie();
        }

    }
}
