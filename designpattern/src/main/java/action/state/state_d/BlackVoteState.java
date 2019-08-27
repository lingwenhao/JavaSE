package action.state.state_d;

/**
 * 黑名单状态
 * @author ronin
 * @version V1.0
 * @since 2019/8/27 10:35
 */
public class BlackVoteState implements VoteState{

    @Override
    public void vote(String user, String voteItem,VoteManager voteManager) {
        //黑名单
        //记入黑名单中，禁止登录系统了
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}
