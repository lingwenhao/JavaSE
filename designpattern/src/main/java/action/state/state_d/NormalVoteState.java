package action.state.state_d;

/**
 * 正常投票状态
 * @author ronin
 * @version V1.0
 * @since 2019/8/27 10:32
 */
public class NormalVoteState implements VoteState{

    @Override
    public void vote(String user, String voteItem,VoteManager voteManager) {
        //正常投票
        //记录到投票记录中
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜你投票成功");
    }
}
