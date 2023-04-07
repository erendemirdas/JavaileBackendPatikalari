public class AwardList {
    private String awardName;

    public AwardList(String awardName){
        this.awardName = awardName;
    }

    public static AwardList[] awarded(String awardName){
        AwardList[] awardList = new AwardList[3];
        awardList[0] = new AwardList(null);
        awardList[1] = new AwardList(null);
        awardList[2] = new AwardList(null);
        return awardList;
    }


    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }
}
