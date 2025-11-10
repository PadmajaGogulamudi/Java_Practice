package com.practice;
class PF { final void mf(){ System.out.println("PF.mf"); } }
class CF extends PF {
	
  //   final   void mf(){ } // CE: cannot override final method
	
}
