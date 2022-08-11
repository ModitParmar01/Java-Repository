class primitiveDataType{
	public static void main(String[] args){
		byte MyByteValue = (byte)3200;
		short MyShortValue = 4323;
		int MyIntValue = 222233344;
		
		long MyLongvalue = 50000L + 10L*(MyByteValue + MyIntValue + MyShortValue);
		//data type jo do fundamental data type se milkee bna ho.
		System.out.println("Long Value : " + MyLongvalue);
	}
}