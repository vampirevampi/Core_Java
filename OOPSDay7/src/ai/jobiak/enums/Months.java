package ai.jobiak.enums;

public enum Months {
january(31),february(29),march(31),april(30),may(31),june(30),july(31),august(30),september(31),novenmber(30),decenber(31);

int No_days;
Months(int No_days)
{
	this.No_days=No_days;
}
}