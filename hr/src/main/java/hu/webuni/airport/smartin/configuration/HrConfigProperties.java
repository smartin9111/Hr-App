package hu.webuni.airport.smartin.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "hr")
@Component
public class HrConfigProperties {

	private Human human = new Human();
	
	public Human getHuman() {
		return human;
	}

	public void setHuman(Human human) {
		this.human = human;
	}

	public static class Human {
		private Default def = new Default();
		private Smart smart = new Smart();
		
		public Default getDef() {
			return def;
		}
		public void setDef(Default def) {
			this.def = def;
		}
		public Smart getSmart() {
			return smart;
		}
		public void setSmart(Smart smart) {
			this.smart = smart;
		}
	}
	
	public static class Default{
		private int percent;

		public int getPercent() {
			return percent;
		}

		public void setPercent(int percent) {
			this.percent = percent;
		}
	}
	
	public static class Smart{
		private int yearlimitsenior;
		private int yearlimitmedior;
		private double yearlimitjunior;

		private int bigpercent;
		private int mediumpercent;
		private int smallpercent;
		private int beginerpercent;
		public int getYearlimitsenior() {
			return yearlimitsenior;
		}
		public void setYearlimitsenior(int yearlimitsenior) {
			this.yearlimitsenior = yearlimitsenior;
		}
		public int getYearlimitmedior() {
			return yearlimitmedior;
		}
		public void setYearlimitmedior(int yearlimitmedior) {
			this.yearlimitmedior = yearlimitmedior;
		}
		public double getYearlimitjunior() {
			return yearlimitjunior;
		}
		public void setYearlimitjunior(double yearlimitjunior) {
			this.yearlimitjunior = yearlimitjunior;
		}
		public int getBigpercent() {
			return bigpercent;
		}
		public void setBigpercent(int bigpercent) {
			this.bigpercent = bigpercent;
		}
		public int getMediumpercent() {
			return mediumpercent;
		}
		public void setMediumpercent(int mediumpercent) {
			this.mediumpercent = mediumpercent;
		}
		public int getSmallpercent() {
			return smallpercent;
		}
		public void setSmallpercent(int smallpercent) {
			this.smallpercent = smallpercent;
		}
		public int getBeginerpercent() {
			return beginerpercent;
		}
		public void setBeginerpercent(int beginerpercent) {
			this.beginerpercent = beginerpercent;
		}
	}
}
