package br.com.alpha6.klout.model;

public class Influence {

	private Entity[] myInfluencers;
	private Entity[] myInfluencees;
	private int myInfluencersCount;
	private int myInfluenceesCount;

	public Entity[] getMyInfluencers() {
		return myInfluencers;
	}

	public void setMyInfluencers(Entity[] myInfluencers) {
		this.myInfluencers = myInfluencers;
	}

	public Entity[] getMyInfluencees() {
		return myInfluencees;
	}

	public void setMyInfluencees(Entity[] myInfluencees) {
		this.myInfluencees = myInfluencees;
	}

	public int getMyInfluencersCount() {
		return myInfluencersCount;
	}

	public void setMyInfluencersCount(int myInfluencersCount) {
		this.myInfluencersCount = myInfluencersCount;
	}

	public int getMyInfluenceesCount() {
		return myInfluenceesCount;
	}

	public void setMyInfluenceesCount(int myInfluenceesCount) {
		this.myInfluenceesCount = myInfluenceesCount;
	}

}
