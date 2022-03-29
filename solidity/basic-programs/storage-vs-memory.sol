// SPDX-License-Identifier: GPL-3.0

pragma solidity >=0.5.0 < 0.9.0;

contract stateDemo { 
    string[] public students = ["Ravi", "Palak", "Pranjal"];

    function mem() public view
    {
        string[] memory s1 = students;
        s1[0] = "Nitin";
    }

    function sto() public
    {
        string[] storage s1 = students;
        s1[0] = "Nitin";
    }
}

// code to analyse the different behaviour or students array as per usage of memory/storage