// Question for Vivek and Prashant- Given two string
// print the longest similar characters sequentially in both the strings.
// Let str1 = "ALHIOPK" Let str2 = "KHXOLPMK
// Output: "KHOLPK"

let str1='KHXOLPMK'
let str2='ALHIOPK';

let ans="";
for(let i=0;i<str1.length;i++){
    for(let j=0;j<str2.length;j++){
        if(str1.charAt(i)==str2.charAt(j)){
            ans=ans+str1.charAt(i);
        }
    }
}
console.log(ans);

// output : - 
// KHOLPK
