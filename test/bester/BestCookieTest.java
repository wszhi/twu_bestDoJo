package bester;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestCookieTest {
    @Test
    public void shouldReturnNullWhenThereIsNoCookie() {
        BestCookie bestCookieFinder = new BestCookie();
        assertEquals(null, bestCookieFinder.findBest());
    }

    @Test
    public void shouldReturnSameCookieWhenOnlyOneCookie() {
        Cookie cookie = new Cookie(2);
        BestCookie bestCookieFinder = new BestCookie();
        assertEquals(cookie, bestCookieFinder.findBest(cookie));
    }

    @Test
    public void shouldReturnCookie2IfCookie1IsBest() {
        Cookie cookie1 = new Cookie(1);
        Cookie cookie2 = new Cookie(2);

        BestCookie bestCookieFinder = new BestCookie();
        assertEquals(cookie2, bestCookieFinder.findBest(cookie1,cookie2));
    }
}
