// SPDX-License-Identifier: GPL-3.0

pragma solidity >=0.5.0 < 0.9.0;
contract enumDemo {
    enum user { allowed, not_allowed, wait}

    user public user1 = user.allowed;

    uint public lottery_amt = 1000;
    function owner() public {
        if(user1 == user.allowed){
            lottery_amt = 0;
        }
    }
}