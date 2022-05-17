package ai.jobiak.enums;

public enum Cards {
	clubs(13),diamonds(13),heart(13),spade(13);
	int num;
Cards(int num)
{
	this.num=num;
}
int show(int num)
{
	return this.num;
}
}