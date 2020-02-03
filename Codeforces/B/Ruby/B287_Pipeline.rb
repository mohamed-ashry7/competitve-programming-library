





def howMany(low , high , k ,n )
    minn = k 
    while low <= high 
        mid = (low+high)/2
        lowerBound =(mid*(mid+1)) / 2 + 1 
        comp = k-mid-1 
        upperBound = 0 
        if comp == 1
            upperBound = k*(k-1 ) / 2 
        else 
            summ= comp*(comp+1) /2 + 1 
            upperBound = k*(k-1) / 2 +1 -summ +1
        end
        if n < lowerBound
            high = mid-1
        elsif n > upperBound
            low = mid +1 
        else
            minn = [mid,minn].min
            high = mid - 1 
        end
    end
    minn

end





n , k =gets.split.map(&:to_i)
lower = 2 
upper = (k*(k-1) / 2 )+ 1 

if n < lower || n > upper 
    puts n==1?0:-1
else
    if n <= k
        puts 1 
    elsif n == upper
        puts k-1
    else
        puts howMany(2,k-1,k,n)
    end
end


