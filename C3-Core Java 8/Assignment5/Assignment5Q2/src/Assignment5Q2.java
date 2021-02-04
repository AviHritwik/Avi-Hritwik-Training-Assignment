import java.util.*;
import java.util.stream.Collectors;

public class Assignment5Q2 {

    /**
     * 1. Find out the newsId which has received maximum comments.
     *
     * 2. Find out how many times the word 'budget' arrived in user comments all news.
     *
     * 3. Find out which user has posted maximum comments.
     *
     * 4. Display commentByUser wise number of comments.
     */
    public static int maxComments(List<News> news) {
        return news.stream().collect(Collectors.groupingBy(news1 -> news1.getNewsId(), Collectors.counting())).
                entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).orElseThrow(NoSuchElementException::new).getKey();
    }

    public static int budgetCount (List < News > news) {
        return (int) news.stream().filter(news1 -> news1.getComment().contains("budget")).count();
    }
    public static String maxCommentsByUser (List < News > news) {
        return news.stream().collect(Collectors.groupingBy(news1 -> news1.getCommentByUser(), Collectors.counting())).
                entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).orElseThrow(NoSuchElementException::new).getKey();
    }

    public static Map<String, Long> sortMaxCommentsByUser (List < News > news) {
        return (Map<String, Long>) news.stream().collect(Collectors.groupingBy(news1 -> news1.getCommentByUser(), Collectors.counting())).entrySet().
                stream().sorted(Comparator.comparing(Map.Entry::getValue));
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        List<News> newsList= new ArrayList<>();
        System.out.println("Enter news details : ");
        while(true)
        {
            News news=new News();
            System.out.print("News ID : ");
            news.setNewsId(input.nextInt());
            System.out.print("Posted By : ");
            news.setPostedByUser(input.next());
            System.out.print("Comment By : ");
            news.setCommentByUser(input.next());
            System.out.println("Comment : ");
            news.setComment(input.next());
            newsList.add(news);
            System.out.println("Enter \n\t1:- For more entry\n\t0:- to stop");
            if(input.nextInt()==0)
                break;
        }
        System.out.println("newsId which has received maximum comments: "+maxComments(newsList));
        System.out.println("Number of times the word 'budget' arrived in user comments in all news: "+budgetCount(newsList));
        System.out.println("user has posted maximum comments: "+maxCommentsByUser(newsList));
        System.out.println("commentByUser wise number of comments: "+sortMaxCommentsByUser(newsList));
    }
}
