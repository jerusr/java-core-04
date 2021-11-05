package ua.lviv.lgs;

public class Robot {
	
		private String work;
		
		Robot (String work){
			this.work = work;
		}

		@Override
		public String toString() {
			return "" + work + "";
		}
		
}
