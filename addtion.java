echo " enter the numbers to addtion in the file by using the read command"
 
  echo "entering name of file is addtion"
  n1=10
  n2=10
  file=`expr $n1 + $n2 `
  echo "sum of the file" $file

 read server name
  echo "sever is active or not"
  service status sshd

