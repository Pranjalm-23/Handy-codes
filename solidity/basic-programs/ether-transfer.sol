// SPDX-License-Identifier: GPL-3.0

pragma solidity >=0.5.0 < 0.9.0;

contract transferDemo 
{   
    // from this contract the ether will be transferred to this account (sendEtherAccount function)
    address payable user = payable(0x1aE0EA34a72D944a8C7603FfB3eC30a6669E454C);

   function payEther() public payable
   {
      // fetches ether from the account whuich pay ether
   }

   function getBalance() public view returns(uint)
   {
       return address(this).balance;
   }

  
   function sendEtherAccount() public
   {
      // contract --> user Account
      user.transfer(1 ether);
   }
}