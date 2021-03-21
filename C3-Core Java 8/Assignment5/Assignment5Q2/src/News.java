public class News {
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public void setPostedByUser(String postedByUser) {
        this.postedByUser = postedByUser;
    }

    public void setCommentByUser(String commentByUser) {
        this.commentByUser = commentByUser;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getNewsId() {
        return newsId;
    }

    public String getPostedByUser() {
        return postedByUser;
    }

    public String getCommentByUser() {
        return commentByUser;
    }

    public String getComment() {
        return comment;
    }
}
