int start=low, seq = 0;
while(start<=high){
String s = String.valueOf(start);
for(int i=1;i<s.length();i++){
if(s.charAt(i)-s.charAt(i-1)==1){
seq = 1;
}
else{
seq=0;
}
if(seq==0) break;
}
if(seq == 1) ls.add(start);
start++;
}