
def get_number_seq():
   """
   生成数字徐略
   """
   numbers = [];
   for i in range(1 ,300):
       numbers.append(i)

   return numbers;

def dichotomy(item,list=[]):
    """
    二分查找
    :param list:
    :param item:
    :return:
    """
    high = len(list) - 1
    low  = 0
    while low <= high:
        mid = int((high + low) / 2)
        guess = list[mid]
        if guess > item:
            print("Guess larger")
            high = mid - 1
        elif guess < item:
            low = mid + 1
            print("Guess smaller")
        elif guess == item:
            print("Guess right {} \n OVER".format(guess))
            break
        else:
            print("NONE")


if __name__ == '__main__':
    numbers = get_number_seq();
    dichotomy(151,numbers)
