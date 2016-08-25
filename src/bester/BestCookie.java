package bester;


public class BestCookie {

    public Cookie findBest(Cookie... cookies) {
        if(cookies.length == 0)
            return null;
        Cookie cookieBest= cookies[0];
        for (Cookie cookieItem: cookies
             ) {
            if(cookieItem.isBetterThan(cookieBest)){
                cookieBest=cookieItem;
            }
        }
        return cookieBest;
    }
}
