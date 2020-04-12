package cn.ganzhiqiang.searcharchitectrue.branch;

import java.util.List;

/**
 * @author zq_gan
 * @since 2020/4/5
 **/

public class BranchResult {

    private List<BranchEnum> matchResults;
    private boolean isMatch;

    public List<BranchEnum> getMatchResults() {
        return matchResults;
    }

    public void setMatchResults(List<BranchEnum> matchResults) {
        this.matchResults = matchResults;
    }

    public boolean isMatch() {
        return isMatch;
    }

    public void setMatch(boolean match) {
        isMatch = match;
    }
}
