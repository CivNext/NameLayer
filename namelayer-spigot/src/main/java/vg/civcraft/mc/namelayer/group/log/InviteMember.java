package vg.civcraft.mc.namelayer.group.log;

import java.util.UUID;

public class InviteMember extends LoggedGroupAction {

	private String rank;
	private UUID invitee;
	
	public InviteMember(long time, UUID player, UUID invitee, String rank) {
		super(time, player);
		this.rank = rank;
		this.invitee = invitee;
	}
	
	public UUID getInvitee() {
		return invitee;
	}
	
	public String getRank() {
		return rank;
	}

}
