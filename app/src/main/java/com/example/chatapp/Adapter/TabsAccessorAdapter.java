package com.example.chatapp.Adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.chatapp.Fragment.ChatsFragment;
import com.example.chatapp.Fragment.ContactsFragment;
import com.example.chatapp.Fragment.RequestsFragment;

public class TabsAccessorAdapter extends FragmentPagerAdapter
{

    public TabsAccessorAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int i)
    {
        switch (i)
        {
            case 0:
                ChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment;


            case 1:
                ContactsFragment contactsFragment = new ContactsFragment();
                return contactsFragment;

            case 2:
                RequestsFragment requestsFragment = new RequestsFragment();
                return requestsFragment;

            default:
                return null;
        }
    }


    @Override
    public int getCount()
    {
        return 3;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0:
                return "Chats";

            case 1:
                return "Contacts";

            case 2:
                return "Requests";

            default:
                return null;
        }
    }
}
