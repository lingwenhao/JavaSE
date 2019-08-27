package action.state.state_d;

/**
 * 重复投票状态
 * @author ronin
 * @version V1.0
 * @since 2019/8/27 10:32
 */
public class RepeatVoteState implements VoteState{

    @Override
    public void vote(String user, String voteItem,VoteManager voteManager) {
        //重复投票
        //暂时不做处理
        System.out.println("请不要重复投票");
    }
}
