public class Periodical extends Item{
    private int issueNum;

    Periodical(){

    }
    Periodical(int issueNum, String title){
        setTitle(title);
        setIssueNum(issueNum);
    }

    public void setIssueNum(int issueNum){
        this.issueNum = issueNum;
    }
    public int getIssueNum(){
        return issueNum;
    }

    public String getListing(){
        return "Periodical Title - " + getTitle() +"\nIssue # - " + getIssueNum();
    }

}
