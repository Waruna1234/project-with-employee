
public class Employe {
	
		private String name;
		private String nic;
		private String address;
		private String id;
		private String code;
		
		
		
		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getNic() {
			return nic;
		}



		public void setNic(String nic) {
			this.nic = nic;
		}



		public String getAddress() {
			return address;
		}



		public void setAddress(String address) {
			this.address = address;
		}



		public String getId() {
			return id;
		}



		public void setId(String id) {
			this.id = id;
		}



		public String getCode() {
			return code;
		}



		public void setCode(String code) {
			this.code = code;
		}
		
		
		
		public boolean equals(Employe o) {
			if(o!= null) {
				return this.code.equals(o.getCode());
				}
			
			return false;
			
		}
		
		

		public Employe(String name, String nic, String address, String id,String code) {
			
			this.name = name;
			this.nic = nic;
			this.address = address;
			this.id = id;
			this.code = code;
		}	

}
