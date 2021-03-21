public class Assignment2Q6 {
    public static void main(String[] args) {
        Client client=new Client();
        Persistence persistence;
        persistence=new FilePersistence();
        System.out.println("Passing persistence object to client");
        client.invokePersistence(persistence);
        persistence=new DatabasePersistence();
        System.out.println("Passing persistence object to client");
        client.invokePersistence(persistence);

    }
}
