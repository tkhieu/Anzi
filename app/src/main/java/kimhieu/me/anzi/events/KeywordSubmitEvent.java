package kimhieu.me.anzi.events;

public class KeywordSubmitEvent {

    private String mQuery;

    public KeywordSubmitEvent(String query) {
        this.mQuery = query;
    }

    public String getmQuery() {
        return mQuery;
    }
}