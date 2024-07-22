class CountryRunner2
 {
	 public static void main(String[]args)
	 {
		 System.out.println("running main in CountryRunner2");
		 String[] statesName={"Andhra Pradesh", "Arunachal Pradesh", "Assam"," Bihar", "Chhattisgarh", "Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra", "Manipur","Meghalaya", "Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu", "Telangana","Tripura","Uttar Pradesh","Uttarakhand","WestBengal"};
         Country2.countryNameBackward(statesName);
		 int[] pincodeNo={500001,788999,781001,800001,490001,403999,396999,127999,171001,834999};
		 Country2.countryNoBackWard(pincodeNo);
		 String[] ministersNo={"Jawaharlal Nehru","Gulzarilal Nanda","Indira Gandhi" ,"Morarji Desai " , "Charan Singh", "Rajiv Gandhi ","Vishwanath Pratap Singh","Chandra Shekhar","P. V. Narasimha Rao","Atal Bihari Vajpayee","H. D. Deve Gowda","I. K. Gujral","Manmohan Singh","Narendra Modi"};
	     Country2.primeministerBackWard(ministersNo);
		 String[] cabinetministers={"Shri H. D. Kumaraswamy","Shri Rajnath Singh","Shri Amit Shah" ,"Shri Nitin Jairam Gadkari" , "Smt. Nirmala Sitharaman","Shri Shivraj Singh Chouhan","Dr. Subrahmanyam Jaishankar	","Shri Jagat Prakash Nadda","Shri Manohar Lal","Shri Piyush Goyal","Shri Dharmendra Pradhan","Shri Rajiv Ranjan Singh","Shri Sarbananda Sonowal","Dr Virendra Kumar","Shri Kinjarapu Rammohan Naidu",	"Shri Kinjarapu Rammohan Naidu","Shri Pralhad Joshi","Shri Jual Oram","Shri Giriraj Singh","Shri Ashwini Vaishnaw","Shri Jyotiraditya M. Scindia","Shri Bhupender Yadav","Shri Gajendra Singh Shekhawat","Smt. Annpurna Devi","Shri Kiren Rijiju","Shri Hardeep Singh Puri","Dr. Mansukh Mandaviya","Shri G. Kishan Reddy","Shri Chirag Paswan","ShriCRPatil"};
	     Country2.ministerNoBackWard(cabinetministers);
		 String[] politicalparties={"BJP","INC","AAP" ,"TMC" , "BSP"};
		 Country2.chargerBackWard(politicalparties);
     }
}