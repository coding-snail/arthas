package com.taobao.arthas.core.util.matcher;

/**
 * @author ralf0131 2017-01-06 13:33.
 */
public class FalseMatcher<T> implements Matcher<T> {

    @Override
    public boolean matching(T target) {
        return false;
    }
}